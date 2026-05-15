package mono.android.widget;


public class TabHost_OnTabChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.widget.TabHost.OnTabChangeListener
{

	public TabHost_OnTabChangeListenerImplementor ()
	{
		super ();
		if (getClass () == TabHost_OnTabChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Widget.TabHost+IOnTabChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTabChanged (java.lang.String p0)
	{
		n_onTabChanged (p0);
	}

	private native void n_onTabChanged (java.lang.String p0);

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
