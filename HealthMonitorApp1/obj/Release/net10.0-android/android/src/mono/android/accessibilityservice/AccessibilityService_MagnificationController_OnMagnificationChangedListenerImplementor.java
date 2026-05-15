package mono.android.accessibilityservice;


public class AccessibilityService_MagnificationController_OnMagnificationChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener
{

	public AccessibilityService_MagnificationController_OnMagnificationChangedListenerImplementor ()
	{
		super ();
		if (getClass () == AccessibilityService_MagnificationController_OnMagnificationChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.AccessibilityServices.AccessibilityService+MagnificationController+IOnMagnificationChangedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onMagnificationChanged (android.accessibilityservice.AccessibilityService.MagnificationController p0, android.graphics.Region p1, float p2, float p3, float p4)
	{
		n_onMagnificationChanged (p0, p1, p2, p3, p4);
	}

	private native void n_onMagnificationChanged (android.accessibilityservice.AccessibilityService.MagnificationController p0, android.graphics.Region p1, float p2, float p3, float p4);

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
