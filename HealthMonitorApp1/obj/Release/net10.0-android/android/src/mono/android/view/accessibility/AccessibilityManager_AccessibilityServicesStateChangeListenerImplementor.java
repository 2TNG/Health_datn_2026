package mono.android.view.accessibility;


public class AccessibilityManager_AccessibilityServicesStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.accessibility.AccessibilityManager.AccessibilityServicesStateChangeListener
{

	public AccessibilityManager_AccessibilityServicesStateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AccessibilityManager_AccessibilityServicesStateChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.Accessibility.AccessibilityManager+IAccessibilityServicesStateChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAccessibilityServicesStateChanged (android.view.accessibility.AccessibilityManager p0)
	{
		n_onAccessibilityServicesStateChanged (p0);
	}

	private native void n_onAccessibilityServicesStateChanged (android.view.accessibility.AccessibilityManager p0);

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
