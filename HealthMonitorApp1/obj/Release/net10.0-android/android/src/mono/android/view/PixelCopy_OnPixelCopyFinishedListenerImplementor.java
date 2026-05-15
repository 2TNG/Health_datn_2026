package mono.android.view;


public class PixelCopy_OnPixelCopyFinishedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.PixelCopy.OnPixelCopyFinishedListener
{

	public PixelCopy_OnPixelCopyFinishedListenerImplementor ()
	{
		super ();
		if (getClass () == PixelCopy_OnPixelCopyFinishedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.PixelCopy+IOnPixelCopyFinishedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onPixelCopyFinished (int p0)
	{
		n_onPixelCopyFinished (p0);
	}

	private native void n_onPixelCopyFinished (int p0);

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
