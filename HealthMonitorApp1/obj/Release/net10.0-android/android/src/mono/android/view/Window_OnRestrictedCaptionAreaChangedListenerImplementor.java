package mono.android.view;


public class Window_OnRestrictedCaptionAreaChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.Window.OnRestrictedCaptionAreaChangedListener
{

	public Window_OnRestrictedCaptionAreaChangedListenerImplementor ()
	{
		super ();
		if (getClass () == Window_OnRestrictedCaptionAreaChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.Window+IOnRestrictedCaptionAreaChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onRestrictedCaptionAreaChanged (android.graphics.Rect p0)
	{
		n_onRestrictedCaptionAreaChanged (p0);
	}

	private native void n_onRestrictedCaptionAreaChanged (android.graphics.Rect p0);

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
