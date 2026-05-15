package mono.android.os;


public class FileUtils_ProgressListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.FileUtils.ProgressListener
{

	public FileUtils_ProgressListenerImplementor ()
	{
		super ();
		if (getClass () == FileUtils_ProgressListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.OS.FileUtils+IProgressListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onProgress (long p0)
	{
		n_onProgress (p0);
	}

	private native void n_onProgress (long p0);

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
