package mono.android.os;


public class ActionHandlerCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.Handler.Callback
{

	public ActionHandlerCallback ()
	{
		super ();
		if (getClass () == ActionHandlerCallback.class) {
			mono.android.TypeManager.Activate ("Android.OS.ActionHandlerCallback, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean handleMessage (android.os.Message p0)
	{
		return n_handleMessage (p0);
	}

	private native boolean n_handleMessage (android.os.Message p0);

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
