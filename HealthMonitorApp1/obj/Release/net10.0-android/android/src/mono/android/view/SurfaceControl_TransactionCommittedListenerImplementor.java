package mono.android.view;


public class SurfaceControl_TransactionCommittedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.SurfaceControl.TransactionCommittedListener
{

	public SurfaceControl_TransactionCommittedListenerImplementor ()
	{
		super ();
		if (getClass () == SurfaceControl_TransactionCommittedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.SurfaceControl+ITransactionCommittedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTransactionCommitted ()
	{
		n_onTransactionCommitted ();
	}

	private native void n_onTransactionCommitted ();

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
