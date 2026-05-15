package mono.android.view.textservice;


public class SpellCheckerSession_SpellCheckerSessionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
{

	public SpellCheckerSession_SpellCheckerSessionListenerImplementor ()
	{
		super ();
		if (getClass () == SpellCheckerSession_SpellCheckerSessionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.TextService.SpellCheckerSession+ISpellCheckerSessionListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onGetSentenceSuggestions (android.view.textservice.SentenceSuggestionsInfo[] p0)
	{
		n_onGetSentenceSuggestions (p0);
	}

	private native void n_onGetSentenceSuggestions (android.view.textservice.SentenceSuggestionsInfo[] p0);

	public void onGetSuggestions (android.view.textservice.SuggestionsInfo[] p0)
	{
		n_onGetSuggestions (p0);
	}

	private native void n_onGetSuggestions (android.view.textservice.SuggestionsInfo[] p0);

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
