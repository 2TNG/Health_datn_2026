package mono.android.hardware.display;


public class VirtualDisplayConfig_BrightnessListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.hardware.display.VirtualDisplayConfig.BrightnessListener
{

	public VirtualDisplayConfig_BrightnessListenerImplementor ()
	{
		super ();
		if (getClass () == VirtualDisplayConfig_BrightnessListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Hardware.Display.VirtualDisplayConfig+IBrightnessListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onBrightnessChanged (float p0)
	{
		n_onBrightnessChanged (p0);
	}

	private native void n_onBrightnessChanged (float p0);

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
