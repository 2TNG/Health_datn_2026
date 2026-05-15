package mono.android.hardware;


public class SensorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.hardware.SensorListener
{

	public SensorListenerImplementor ()
	{
		super ();
		if (getClass () == SensorListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Hardware.ISensorListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAccuracyChanged (int p0, int p1)
	{
		n_onAccuracyChanged (p0, p1);
	}

	private native void n_onAccuracyChanged (int p0, int p1);

	public void onSensorChanged (int p0, float[] p1)
	{
		n_onSensorChanged (p0, p1);
	}

	private native void n_onSensorChanged (int p0, float[] p1);

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
