package mono.android.speech.tts;


public class TextToSpeech_OnUtteranceCompletedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.speech.tts.TextToSpeech.OnUtteranceCompletedListener
{

	public TextToSpeech_OnUtteranceCompletedListenerImplementor ()
	{
		super ();
		if (getClass () == TextToSpeech_OnUtteranceCompletedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Speech.Tts.TextToSpeech+IOnUtteranceCompletedListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onUtteranceCompleted (java.lang.String p0)
	{
		n_onUtteranceCompleted (p0);
	}

	private native void n_onUtteranceCompleted (java.lang.String p0);

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
