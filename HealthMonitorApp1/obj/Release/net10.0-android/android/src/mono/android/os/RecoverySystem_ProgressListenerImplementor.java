package mono.android.os;


public class RecoverySystem_ProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.RecoverySystem.ProgressListener
{

	public RecoverySystem_ProgressListenerImplementor ()
	{
		super ();
		if (getClass () == RecoverySystem_ProgressListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.OS.RecoverySystem+IProgressListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onProgress (int p0)
	{
		n_onProgress (p0);
	}

	private native void n_onProgress (int p0);

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
