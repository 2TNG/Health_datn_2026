package mono.android.view.accessibility;


public class AccessibilityManager_TouchExplorationStateChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
{

	public AccessibilityManager_TouchExplorationStateChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AccessibilityManager_TouchExplorationStateChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.Accessibility.AccessibilityManager+ITouchExplorationStateChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTouchExplorationStateChanged (boolean p0)
	{
		n_onTouchExplorationStateChanged (p0);
	}

	private native void n_onTouchExplorationStateChanged (boolean p0);

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
