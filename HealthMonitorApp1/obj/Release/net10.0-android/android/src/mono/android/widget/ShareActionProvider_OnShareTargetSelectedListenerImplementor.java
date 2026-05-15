package mono.android.widget;


public class ShareActionProvider_OnShareTargetSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.ShareActionProvider.OnShareTargetSelectedListener
{

	public ShareActionProvider_OnShareTargetSelectedListenerImplementor ()
	{
		super ();
		if (getClass () == ShareActionProvider_OnShareTargetSelectedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.ShareActionProvider+IOnShareTargetSelectedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onShareTargetSelected (android.widget.ShareActionProvider p0, android.content.Intent p1)
	{
		return n_onShareTargetSelected (p0, p1);
	}

	private native boolean n_onShareTargetSelected (android.widget.ShareActionProvider p0, android.content.Intent p1);

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
