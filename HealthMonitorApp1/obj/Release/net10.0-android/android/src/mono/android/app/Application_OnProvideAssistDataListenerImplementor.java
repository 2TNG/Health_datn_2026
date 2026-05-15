package mono.android.app;


public class Application_OnProvideAssistDataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.app.Application.OnProvideAssistDataListener
{

	public Application_OnProvideAssistDataListenerImplementor ()
	{
		super ();
		if (getClass () == Application_OnProvideAssistDataListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.App.Application+IOnProvideAssistDataListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onProvideAssistData (android.app.Activity p0, android.os.Bundle p1)
	{
		n_onProvideAssistData (p0, p1);
	}

	private native void n_onProvideAssistData (android.app.Activity p0, android.os.Bundle p1);

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
