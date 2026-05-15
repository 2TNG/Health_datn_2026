package mono.android.os;


public class PowerManager_WakeLockStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.PowerManager.WakeLockStateListener
{

	public PowerManager_WakeLockStateListenerImplementor ()
	{
		super ();
		if (getClass () == PowerManager_WakeLockStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.OS.PowerManager+IWakeLockStateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onStateChanged (boolean p0)
	{
		n_onStateChanged (p0);
	}

	private native void n_onStateChanged (boolean p0);

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
