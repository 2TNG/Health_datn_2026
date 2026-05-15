package mono.android.app;


public class KeyguardManager_KeyguardLockedStateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.KeyguardManager.KeyguardLockedStateListener
{

	public KeyguardManager_KeyguardLockedStateListenerImplementor ()
	{
		super ();
		if (getClass () == KeyguardManager_KeyguardLockedStateListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.KeyguardManager+IKeyguardLockedStateListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onKeyguardLockedStateChanged (boolean p0)
	{
		n_onKeyguardLockedStateChanged (p0);
	}

	private native void n_onKeyguardLockedStateChanged (boolean p0);

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
