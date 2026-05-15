package mono.android.app;


public class UiAutomation_OnAccessibilityEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.UiAutomation.OnAccessibilityEventListener
{

	public UiAutomation_OnAccessibilityEventListenerImplementor ()
	{
		super ();
		if (getClass () == UiAutomation_OnAccessibilityEventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.UiAutomation+IOnAccessibilityEventListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAccessibilityEvent (android.view.accessibility.AccessibilityEvent p0)
	{
		n_onAccessibilityEvent (p0);
	}

	private native void n_onAccessibilityEvent (android.view.accessibility.AccessibilityEvent p0);

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
