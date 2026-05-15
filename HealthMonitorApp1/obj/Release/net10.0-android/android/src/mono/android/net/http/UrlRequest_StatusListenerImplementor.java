package mono.android.net.http;


public class UrlRequest_StatusListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.net.http.UrlRequest.StatusListener
{

	public UrlRequest_StatusListenerImplementor ()
	{
		super ();
		if (getClass () == UrlRequest_StatusListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Net.Http.UrlRequest+IStatusListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onStatus (int p0)
	{
		n_onStatus (p0);
	}

	private native void n_onStatus (int p0);

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
