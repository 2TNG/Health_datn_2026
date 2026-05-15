package mono.android.view.accessibility;


public class AccessibilityManager_AccessibilityStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
{

	public AccessibilityManager_AccessibilityStateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AccessibilityManager_AccessibilityStateChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.Accessibility.AccessibilityManager+IAccessibilityStateChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAccessibilityStateChanged (boolean p0)
	{
		n_onAccessibilityStateChanged (p0);
	}

	private native void n_onAccessibilityStateChanged (boolean p0);

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
