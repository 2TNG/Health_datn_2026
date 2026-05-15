package mono.androidx.loader.content;


public class Loader_OnLoadCompleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.loader.content.Loader.OnLoadCompleteListener
{

	public Loader_OnLoadCompleteListenerImplementor ()
	{
		super ();
		if (getClass () == Loader_OnLoadCompleteListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Loader.Content.Loader+IOnLoadCompleteListenerImplementor, Xamarin.AndroidX.Loader", "", this, new java.lang.Object[] {  });
		}
	}

	public void onLoadComplete (androidx.loader.content.Loader p0, java.lang.Object p1)
	{
		n_onLoadComplete (p0, p1);
	}

	private native void n_onLoadComplete (androidx.loader.content.Loader p0, java.lang.Object p1);

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
