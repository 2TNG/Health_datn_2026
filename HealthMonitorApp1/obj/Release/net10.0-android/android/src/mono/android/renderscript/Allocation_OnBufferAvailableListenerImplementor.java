package mono.android.renderscript;


public class Allocation_OnBufferAvailableListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.renderscript.Allocation.OnBufferAvailableListener
{

	public Allocation_OnBufferAvailableListenerImplementor ()
	{
		super ();
		if (getClass () == Allocation_OnBufferAvailableListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Renderscripts.Allocation+IOnBufferAvailableListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onBufferAvailable (android.renderscript.Allocation p0)
	{
		n_onBufferAvailable (p0);
	}

	private native void n_onBufferAvailable (android.renderscript.Allocation p0);

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
