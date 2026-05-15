package mono.android.view.accessibility;


public class AccessibilityManager_HighContrastTextStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.accessibility.AccessibilityManager.HighContrastTextStateChangeListener
{

	public AccessibilityManager_HighContrastTextStateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AccessibilityManager_HighContrastTextStateChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.Accessibility.AccessibilityManager+IHighContrastTextStateChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onHighContrastTextStateChanged (boolean p0)
	{
		n_onHighContrastTextStateChanged (p0);
	}

	private native void n_onHighContrastTextStateChanged (boolean p0);

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
