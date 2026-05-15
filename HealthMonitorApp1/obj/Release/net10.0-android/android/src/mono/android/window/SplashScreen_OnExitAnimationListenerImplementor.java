package mono.android.window;


public class SplashScreen_OnExitAnimationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.window.SplashScreen.OnExitAnimationListener
{

	public SplashScreen_OnExitAnimationListenerImplementor ()
	{
		super ();
		if (getClass () == SplashScreen_OnExitAnimationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Window.ISplashScreenOnExitAnimationListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onSplashScreenExit (android.window.SplashScreenView p0)
	{
		n_onSplashScreenExit (p0);
	}

	private native void n_onSplashScreenExit (android.window.SplashScreenView p0);

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
