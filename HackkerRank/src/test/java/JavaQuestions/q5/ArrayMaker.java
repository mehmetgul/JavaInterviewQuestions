package JavaQuestions.q5;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class ArrayMaker
{
	public ArrayMaker(int originalSize)
	{
		if (originalSize == 0) throw new IllegalArgumentException();

		m_array = IntStream.range(1, originalSize + 1).boxed().collect(Collectors.toList());
		Collections.shuffle(m_array);

		int index = ThreadLocalRandom.current().nextInt(0, originalSize);
		m_missing = m_array.remove(index);
	}

	public Collection<Integer> GetArray()
	{
		return Collections.unmodifiableCollection(m_array);
	}

	public int GetMissing()
	{
		return m_missing;
	}

	private List<Integer> m_array;
	private int m_missing;
}