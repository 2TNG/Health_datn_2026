package mono.android.view.accessibility;


public class AccessibilityManager_AudioDescriptionRequestedChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.accessibility.AccessibilityManager.AudioDescriptionRequestedChangeListener
{

	public AccessibilityManager_AudioDescriptionRequestedChangeListenerImplementor ()
	{
		super ();
		if (getClass () == AccessibilityManager_AudioDescriptionRequestedChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.Accessibility.AccessibilityManager+IAudioDescriptionRequestedChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAudioDescriptionRequestedChanged (boolean p0)
	{
		n_onAudioDescriptionRequestedChanged (p0);
	}

	private native void n_onAudioDescriptionRequestedChanged (boolean p0);

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
