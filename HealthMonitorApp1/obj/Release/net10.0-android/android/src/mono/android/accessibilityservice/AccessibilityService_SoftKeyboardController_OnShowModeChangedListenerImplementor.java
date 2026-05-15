package mono.android.accessibilityservice;


public class AccessibilityService_SoftKeyboardController_OnShowModeChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener
{

	public AccessibilityService_SoftKeyboardController_OnShowModeChangedListenerImplementor ()
	{
		super ();
		if (getClass () == AccessibilityService_SoftKeyboardController_OnShowModeChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.AccessibilityServices.AccessibilityService+SoftKeyboardController+IOnShowModeChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onShowModeChanged (android.accessibilityservice.AccessibilityService.SoftKeyboardController p0, int p1)
	{
		n_onShowModeChanged (p0, p1);
	}

	private native void n_onShowModeChanged (android.accessibilityservice.AccessibilityService.SoftKeyboardController p0, int p1);

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
