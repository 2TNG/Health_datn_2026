package mono.android.speech.tts;


public class TextToSpeech_OnInitListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.speech.tts.TextToSpeech.OnInitListener
{

	public TextToSpeech_OnInitListenerImplementor ()
	{
		super ();
		if (getClass () == TextToSpeech_OnInitListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Speech.Tts.TextToSpeech+IOnInitListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onInit (int p0)
	{
		n_onInit (p0);
	}

	private native void n_onInit (int p0);

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
