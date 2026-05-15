package mono.com.bumptech.glide.request;


public class RequestListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.bumptech.glide.request.RequestListener
{

	public RequestListenerImplementor ()
	{
		super ();
		if (getClass () == RequestListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Bumptech.Glide.Request.IRequestListenerImplementor, Xamarin.Android.Glide", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onLoadFailed (com.bumptech.glide.load.engine.GlideException p0, java.lang.Object p1, com.bumptech.glide.request.target.Target p2, boolean p3)
	{
		return n_onLoadFailed (p0, p1, p2, p3);
	}

	private native boolean n_onLoadFailed (com.bumptech.glide.load.engine.GlideException p0, java.lang.Object p1, com.bumptech.glide.request.target.Target p2, boolean p3);

	public boolean onResourceReady (java.lang.Object p0, java.lang.Object p1, com.bumptech.glide.request.target.Target p2, com.bumptech.glide.load.DataSource p3, boolean p4)
	{
		return n_onResourceReady (p0, p1, p2, p3, p4);
	}

	private native boolean n_onResourceReady (java.lang.Object p0, java.lang.Object p1, com.bumptech.glide.request.target.Target p2, com.bumptech.glide.load.DataSource p3, boolean p4);

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
