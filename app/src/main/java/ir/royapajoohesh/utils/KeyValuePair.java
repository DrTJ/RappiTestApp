package ir.royapajoohesh.utils;

/**
 * Created by Dr TJ on February 2017.
 */
public class KeyValuePair<TKey, TValue> {
	public TKey Key;
	public TValue Value;

	public KeyValuePair(TKey key, TValue value) {
		this.Key = key;
		this.Value = value;
	}
}