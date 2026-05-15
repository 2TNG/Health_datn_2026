package mono.android.app.sdksandbox.sdkprovider;


public class SdkSandboxClientImportanceListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.sdksandbox.sdkprovider.SdkSandboxClientImportanceListener
{

	public SdkSandboxClientImportanceListenerImplementor ()
	{
		super ();
		if (getClass () == SdkSandboxClientImportanceListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.SdkSandbox.SdkProvider.ISdkSandboxClientImportanceListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onForegroundImportanceChanged (boolean p0)
	{
		n_onForegroundImportanceChanged (p0);
	}

	private native void n_onForegroundImportanceChanged (boolean p0);

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
