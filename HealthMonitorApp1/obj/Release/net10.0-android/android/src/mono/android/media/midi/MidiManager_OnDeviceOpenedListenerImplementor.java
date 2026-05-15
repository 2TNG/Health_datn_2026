package mono.android.media.midi;


public class MidiManager_OnDeviceOpenedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.midi.MidiManager.OnDeviceOpenedListener
{

	public MidiManager_OnDeviceOpenedListenerImplementor ()
	{
		super ();
		if (getClass () == MidiManager_OnDeviceOpenedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Media.Midi.MidiManager+IOnDeviceOpenedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDeviceOpened (android.media.midi.MidiDevice p0)
	{
		n_onDeviceOpened (p0);
	}

	private native void n_onDeviceOpened (android.media.midi.MidiDevice p0);

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
