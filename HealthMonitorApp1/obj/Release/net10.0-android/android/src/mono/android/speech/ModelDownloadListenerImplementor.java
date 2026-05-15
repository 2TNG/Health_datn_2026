package mono.android.speech;


public class ModelDownloadListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.speech.ModelDownloadListener
{

	public ModelDownloadListenerImplementor ()
	{
		super ();
		if (getClass () == ModelDownloadListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Speech.IModelDownloadListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onError (int p0)
	{
		n_onError (p0);
	}

	private native void n_onError (int p0);

	public void onProgress (int p0)
	{
		n_onProgress (p0);
	}

	private native void n_onProgress (int p0);

	public void onScheduled ()
	{
		n_onScheduled ();
	}

	private native void n_onScheduled ();

	public void onSuccess ()
	{
		n_onSuccess ();
	}

	private native void n_onSuccess ();

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
