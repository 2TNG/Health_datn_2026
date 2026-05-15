package android.runtime;


public class XmlReaderResourceParser
	extends android.runtime.XmlReaderPullParser
	implements
		mono.android.IGCUserPeer,
		android.content.res.XmlResourceParser,
		android.util.AttributeSet,
		org.xmlpull.v1.XmlPullParser
{

	public XmlReaderResourceParser ()
	{
		super ();
		if (getClass () == XmlReaderResourceParser.class) {
			mono.android.TypeManager.Activate ("Android.Runtime.XmlReaderResourceParser, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void close ()
	{
		n_close ();
	}

	private native void n_close ();

	public java.lang.String getAttributeNamespace (int p0)
	{
		return n_getAttributeNamespace (p0);
	}

	private native java.lang.String n_getAttributeNamespace (int p0);

	public int getAttributeCount ()
	{
		return n_getAttributeCount ();
	}

	private native int n_getAttributeCount ();

	public java.lang.String getClassAttribute ()
	{
		return n_getClassAttribute ();
	}

	private native java.lang.String n_getClassAttribute ();

	public java.lang.String getIdAttribute ()
	{
		return n_getIdAttribute ();
	}

	private native java.lang.String n_getIdAttribute ();

	public java.lang.String getPositionDescription ()
	{
		return n_getPositionDescription ();
	}

	private native java.lang.String n_getPositionDescription ();

	public int getStyleAttribute ()
	{
		return n_getStyleAttribute ();
	}

	private native int n_getStyleAttribute ();

	public boolean getAttributeBooleanValue (int p0, boolean p1)
	{
		return n_getAttributeBooleanValue (p0, p1);
	}

	private native boolean n_getAttributeBooleanValue (int p0, boolean p1);

	public boolean getAttributeBooleanValue (java.lang.String p0, java.lang.String p1, boolean p2)
	{
		return n_getAttributeBooleanValue (p0, p1, p2);
	}

	private native boolean n_getAttributeBooleanValue (java.lang.String p0, java.lang.String p1, boolean p2);

	public float getAttributeFloatValue (int p0, float p1)
	{
		return n_getAttributeFloatValue (p0, p1);
	}

	private native float n_getAttributeFloatValue (int p0, float p1);

	public float getAttributeFloatValue (java.lang.String p0, java.lang.String p1, float p2)
	{
		return n_getAttributeFloatValue (p0, p1, p2);
	}

	private native float n_getAttributeFloatValue (java.lang.String p0, java.lang.String p1, float p2);

	public int getAttributeIntValue (int p0, int p1)
	{
		return n_getAttributeIntValue (p0, p1);
	}

	private native int n_getAttributeIntValue (int p0, int p1);

	public int getAttributeIntValue (java.lang.String p0, java.lang.String p1, int p2)
	{
		return n_getAttributeIntValue (p0, p1, p2);
	}

	private native int n_getAttributeIntValue (java.lang.String p0, java.lang.String p1, int p2);

	public int getAttributeListValue (int p0, java.lang.String[] p1, int p2)
	{
		return n_getAttributeListValue (p0, p1, p2);
	}

	private native int n_getAttributeListValue (int p0, java.lang.String[] p1, int p2);

	public int getAttributeListValue (java.lang.String p0, java.lang.String p1, java.lang.String[] p2, int p3)
	{
		return n_getAttributeListValue (p0, p1, p2, p3);
	}

	private native int n_getAttributeListValue (java.lang.String p0, java.lang.String p1, java.lang.String[] p2, int p3);

	public java.lang.String getAttributeName (int p0)
	{
		return n_getAttributeName (p0);
	}

	private native java.lang.String n_getAttributeName (int p0);

	public int getAttributeNameResource (int p0)
	{
		return n_getAttributeNameResource (p0);
	}

	private native int n_getAttributeNameResource (int p0);

	public int getAttributeResourceValue (int p0, int p1)
	{
		return n_getAttributeResourceValue (p0, p1);
	}

	private native int n_getAttributeResourceValue (int p0, int p1);

	public int getAttributeResourceValue (java.lang.String p0, java.lang.String p1, int p2)
	{
		return n_getAttributeResourceValue (p0, p1, p2);
	}

	private native int n_getAttributeResourceValue (java.lang.String p0, java.lang.String p1, int p2);

	public int getAttributeUnsignedIntValue (int p0, int p1)
	{
		return n_getAttributeUnsignedIntValue (p0, p1);
	}

	private native int n_getAttributeUnsignedIntValue (int p0, int p1);

	public int getAttributeUnsignedIntValue (java.lang.String p0, java.lang.String p1, int p2)
	{
		return n_getAttributeUnsignedIntValue (p0, p1, p2);
	}

	private native int n_getAttributeUnsignedIntValue (java.lang.String p0, java.lang.String p1, int p2);

	public java.lang.String getAttributeValue (int p0)
	{
		return n_getAttributeValue (p0);
	}

	private native java.lang.String n_getAttributeValue (int p0);

	public java.lang.String getAttributeValue (java.lang.String p0, java.lang.String p1)
	{
		return n_getAttributeValue (p0, p1);
	}

	private native java.lang.String n_getAttributeValue (java.lang.String p0, java.lang.String p1);

	public int getIdAttributeResourceValue (int p0)
	{
		return n_getIdAttributeResourceValue (p0);
	}

	private native int n_getIdAttributeResourceValue (int p0);

	public int getColumnNumber ()
	{
		return n_getColumnNumber ();
	}

	private native int n_getColumnNumber ();

	public int getDepth ()
	{
		return n_getDepth ();
	}

	private native int n_getDepth ();

	public int getEventType ()
	{
		return n_getEventType ();
	}

	private native int n_getEventType ();

	public java.lang.String getInputEncoding ()
	{
		return n_getInputEncoding ();
	}

	private native java.lang.String n_getInputEncoding ();

	public boolean isEmptyElementTag ()
	{
		return n_isEmptyElementTag ();
	}

	private native boolean n_isEmptyElementTag ();

	public boolean isWhitespace ()
	{
		return n_isWhitespace ();
	}

	private native boolean n_isWhitespace ();

	public int getLineNumber ()
	{
		return n_getLineNumber ();
	}

	private native int n_getLineNumber ();

	public java.lang.String getName ()
	{
		return n_getName ();
	}

	private native java.lang.String n_getName ();

	public java.lang.String getNamespace ()
	{
		return n_getNamespace ();
	}

	private native java.lang.String n_getNamespace ();

	public java.lang.String getPrefix ()
	{
		return n_getPrefix ();
	}

	private native java.lang.String n_getPrefix ();

	public java.lang.String getText ()
	{
		return n_getText ();
	}

	private native java.lang.String n_getText ();

	public void defineEntityReplacementText (java.lang.String p0, java.lang.String p1)
	{
		n_defineEntityReplacementText (p0, p1);
	}

	private native void n_defineEntityReplacementText (java.lang.String p0, java.lang.String p1);

	public java.lang.String getAttributePrefix (int p0)
	{
		return n_getAttributePrefix (p0);
	}

	private native java.lang.String n_getAttributePrefix (int p0);

	public java.lang.String getAttributeType (int p0)
	{
		return n_getAttributeType (p0);
	}

	private native java.lang.String n_getAttributeType (int p0);

	public boolean getFeature (java.lang.String p0)
	{
		return n_getFeature (p0);
	}

	private native boolean n_getFeature (java.lang.String p0);

	public java.lang.String getNamespace (java.lang.String p0)
	{
		return n_getNamespace (p0);
	}

	private native java.lang.String n_getNamespace (java.lang.String p0);

	public int getNamespaceCount (int p0)
	{
		return n_getNamespaceCount (p0);
	}

	private native int n_getNamespaceCount (int p0);

	public java.lang.String getNamespacePrefix (int p0)
	{
		return n_getNamespacePrefix (p0);
	}

	private native java.lang.String n_getNamespacePrefix (int p0);

	public java.lang.String getNamespaceUri (int p0)
	{
		return n_getNamespaceUri (p0);
	}

	private native java.lang.String n_getNamespaceUri (int p0);

	public java.lang.Object getProperty (java.lang.String p0)
	{
		return n_getProperty (p0);
	}

	private native java.lang.Object n_getProperty (java.lang.String p0);

	public char[] getTextCharacters (int[] p0)
	{
		return n_getTextCharacters (p0);
	}

	private native char[] n_getTextCharacters (int[] p0);

	public boolean isAttributeDefault (int p0)
	{
		return n_isAttributeDefault (p0);
	}

	private native boolean n_isAttributeDefault (int p0);

	public int next ()
	{
		return n_next ();
	}

	private native int n_next ();

	public int nextTag ()
	{
		return n_nextTag ();
	}

	private native int n_nextTag ();

	public java.lang.String nextText ()
	{
		return n_nextText ();
	}

	private native java.lang.String n_nextText ();

	public int nextToken ()
	{
		return n_nextToken ();
	}

	private native int n_nextToken ();

	public void require (int p0, java.lang.String p1, java.lang.String p2)
	{
		n_require (p0, p1, p2);
	}

	private native void n_require (int p0, java.lang.String p1, java.lang.String p2);

	public void setFeature (java.lang.String p0, boolean p1)
	{
		n_setFeature (p0, p1);
	}

	private native void n_setFeature (java.lang.String p0, boolean p1);

	public void setInput (java.io.InputStream p0, java.lang.String p1)
	{
		n_setInput (p0, p1);
	}

	private native void n_setInput (java.io.InputStream p0, java.lang.String p1);

	public void setInput (java.io.Reader p0)
	{
		n_setInput (p0);
	}

	private native void n_setInput (java.io.Reader p0);

	public void setProperty (java.lang.String p0, java.lang.Object p1)
	{
		n_setProperty (p0, p1);
	}

	private native void n_setProperty (java.lang.String p0, java.lang.Object p1);

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
