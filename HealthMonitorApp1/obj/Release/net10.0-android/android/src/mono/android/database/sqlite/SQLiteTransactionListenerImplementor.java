package mono.android.database.sqlite;


public class SQLiteTransactionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.database.sqlite.SQLiteTransactionListener
{

	public SQLiteTransactionListenerImplementor ()
	{
		super ();
		if (getClass () == SQLiteTransactionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Database.Sqlite.ISQLiteTransactionListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onBegin ()
	{
		n_onBegin ();
	}

	private native void n_onBegin ();

	public void onCommit ()
	{
		n_onCommit ();
	}

	private native void n_onCommit ();

	public void onRollback ()
	{
		n_onRollback ();
	}

	private native void n_onRollback ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
