package mono.android.view;


public class Window_OnFrameMetricsAvailableListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.Window.OnFrameMetricsAvailableListener
{

	public Window_OnFrameMetricsAvailableListenerImplementor ()
	{
		super ();
		if (getClass () == Window_OnFrameMetricsAvailableListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.Window+IOnFrameMetricsAvailableListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFrameMetricsAvailable (android.view.Window p0, android.view.FrameMetrics p1, int p2)
	{
		n_onFrameMetricsAvailable (p0, p1, p2);
	}

	private native void n_onFrameMetricsAvailable (android.view.Window p0, android.view.FrameMetrics p1, int p2);

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
