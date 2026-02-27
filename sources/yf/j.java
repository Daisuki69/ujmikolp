package yf;

import We.s;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends b implements Comparable {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final j f21167A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public static final j f21168A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final j f21169B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final j f21170B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public static final j f21171B1;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final j f21172C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public static final j f21173C1;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final j f21174D0;
    public static final j D1;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final j f21175E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public static final j f21176E1;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final j f21177F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public static final j f21178F1;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final j f21179G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final j f21180H0;
    public static final j I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final j f21181J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final j f21182K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final j f21183K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final j f21184L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final j f21185M0;
    public static final j N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static final j f21186O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final j f21187P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public static final j f21188P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final j f21189Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public static final j f21190Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final j f21191R;
    public static final j R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final j f21192S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public static final j f21193S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final j f21194T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public static final j f21195T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final j f21196U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final j f21197U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final j f21198V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final j f21199V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final j f21200W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final j f21201W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final j f21202X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final j f21203X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final j f21204Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final j f21205Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final j f21206Z;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final j f21207Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final j f21208a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final j f21209a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final j f21210b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final j f21211b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final j f21212c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final j f21213c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final j f21215d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final j f21216d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final j f21217e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final j f21218e1;
    public static final j f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final j f21219f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final j f21220f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f21221g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final j f21222g0;
    public static final j g1;
    public static final j h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final j f21223h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final j f21224h1;
    public static final j i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final j f21225i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final j f21226i1;
    public static final j j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final j f21227j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final j f21228j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j f21229k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final j f21230k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final j f21231k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f21232l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final j f21233l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final j f21234l1;
    public static final j m;
    public static final j m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final j f21235m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f21236n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final j f21237n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final j f21238n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j f21239o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final j f21240o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final j f21241o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j f21242p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j f21243p0;
    public static final j p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j f21244q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final j f21245q0;
    public static final j q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f21246r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final j f21247r0;
    public static final j r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f21248s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final j f21249s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final j f21250s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f21251t;
    public static final j t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final j f21252t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j f21253u;
    public static final j u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final j f21254u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f21255v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final j f21256v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final j f21257v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j f21258w;
    public static final j w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final j f21259w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final j f21260x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final j f21261x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final j f21262x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j f21263y;
    public static final j y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final j f21264y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final j f21265z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final j f21266z1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21268b;
    public static final ConcurrentHashMap c = new ConcurrentHashMap(8192);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f21214d = new HashMap(768);
    public static final j e = new j(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);

    static {
        new j("AA");
        new j("AbsoluteColorimetric");
        new j("AC");
        new j("AcroForm");
        f = new j("ActualText");
        new j("adbe.pkcs7.detached");
        new j("adbe.pkcs7.sha1");
        new j("adbe.x509.rsa_sha1");
        new j("Adobe.PPKLite");
        f21221g = new j("AESV2");
        h = new j("AESV3");
        new j("After");
        new j("AIMetaData");
        new j("AIS");
        new j("AllOff");
        new j("AllOn");
        i = new j("Alt");
        new j("Alpha");
        new j("Alternate");
        j = new j(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16164M);
        new j("Annots");
        new j("AntiAlias");
        new j("AnyOff");
        new j("AnyOn");
        new j("AP");
        new j("APRef");
        new j("App");
        new j("ArtBox");
        f21229k = new j("Artifact");
        new j("AS");
        new j("Ascent");
        f21232l = new j("ASCIIHexDecode");
        m = new j("AHx");
        f21236n = new j("ASCII85Decode");
        f21239o = new j("A85");
        f21242p = new j("Attached");
        f21244q = new j("Author");
        new j("AvgWidth");
        new j("B");
        new j("Background");
        new j("BaseEncoding");
        new j("BaseFont");
        f21246r = AbstractC2329d.i("BaseState", "BBox");
        new j("BC");
        new j("BE");
        new j("Before");
        new j("BG");
        f21248s = new j("BitsPerComponent");
        new j("BitsPerCoordinate");
        new j("BitsPerFlag");
        new j(ExifInterface.TAG_BITS_PER_SAMPLE);
        f21251t = new j("BlackIs1");
        new j("BlackPoint");
        new j("BleedBox");
        new j("BM");
        new j("Border");
        new j("Bounds");
        new j("BPC");
        new j("BS");
        new j("Btn");
        f21253u = new j("ByteRange");
        f21255v = new j("C");
        new j("C0");
        new j("C1");
        new j("CA");
        new j("ca");
        new j("CalGray");
        new j("CalRGB");
        new j("Cap");
        new j("CapHeight");
        f21258w = new j("Catalog");
        f21260x = new j("CCITTFaxDecode");
        f21263y = new j("CCF");
        new j("CenterWindow");
        new j("Cert");
        f21169B = new j("CF");
        f21182K = new j("CFM");
        new j("Ch");
        new j("CharProcs");
        new j("CharSet");
        new j("CI");
        new j("CICI.SignIt");
        new j("CIDFontType0");
        new j("CIDFontType2");
        new j("CIDToGIDMap");
        new j("CIDSet");
        new j("CIDSystemInfo");
        new j("CL");
        new j("ClrF");
        new j("ClrFf");
        new j("CMap");
        new j("CMapName");
        new j("CMYK");
        new j("CO");
        new j("Color");
        new j("Collection");
        new j("CollectionItem");
        new j("CollectionField");
        new j("CollectionSchema");
        new j("CollectionSort");
        new j("CollectionSubitem");
        new j("ColorBurn");
        new j("ColorDodge");
        new j("Colorants");
        f21187P = new j("Colors");
        f21189Q = new j(ExifInterface.TAG_COLOR_SPACE);
        f21191R = new j("Columns");
        new j("Compatible");
        new j("Components");
        new j("ContactInfo");
        f21192S = new j("Contents");
        f21194T = AbstractC2329d.i("Coords", "Count");
        f21196U = AbstractC2329d.i("CP", "CreationDate");
        f21198V = new j("Creator");
        f21200W = AbstractC2329d.i("CropBox", "Crypt");
        f21202X = AbstractC2329d.i("CS", Ef.a.c);
        new j("DA");
        new j("Darken");
        new j(RtspHeaders.DATE);
        f21204Y = new j("DCTDecode");
        f21206Z = new j("DCT");
        f21208a0 = AbstractC2329d.i("Decode", "DecodeParms");
        new j("default");
        new j("DefaultCMYK");
        f21210b0 = new j("DefaultCryptFilter");
        new j("DefaultGray");
        new j("DefaultRGB");
        new j("Desc");
        new j("DescendantFonts");
        new j("Descent");
        f21212c0 = new j("Dest");
        new j("DestOutputProfile");
        new j("Dests");
        new j("DeviceCMYK");
        new j("DeviceGray");
        new j("DeviceN");
        f21215d0 = new j("DeviceRGB");
        new j("Di");
        new j("Difference");
        new j("Differences");
        new j("DigestMethod");
        new j("RIPEMD160");
        new j("SHA1");
        new j("SHA256");
        new j("SHA384");
        new j("SHA512");
        new j("Direction");
        new j("DisplayDocTitle");
        new j("DL");
        new j("Dm");
        new j("Doc");
        new j("DocChecksum");
        f21217e0 = new j("DocTimeStamp");
        new j("DocMDP");
        new j(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16176a);
        new j("Domain");
        new j("DOS");
        f21219f0 = new j("DP");
        new j("DR");
        new j("DS");
        new j("Duplex");
        new j("Dur");
        new j("DV");
        new j("DW");
        new j("DW2");
        f21222g0 = new j(ExifInterface.LONGITUDE_EAST);
        f21223h0 = new j("EarlyChange");
        new j("EF");
        new j("EmbeddedFDFs");
        new j("EmbeddedFiles");
        new j("");
        new j("Encode");
        f21225i0 = new j("EncodedByteAlign");
        new j("Encoding");
        new j("90ms-RKSJ-H");
        new j("90ms-RKSJ-V");
        new j("ETen-B5-H");
        new j("ETen-B5-V");
        f21227j0 = new j("Encrypt");
        f21230k0 = new j("EncryptMetadata");
        new j("EndOfLine");
        new j("Entrust.PPKEF");
        new j("Exclusion");
        new j("ExtGState");
        new j("Extend");
        f21233l0 = AbstractC2329d.i("Extends", "F");
        new j("FDecodeParms");
        new j("FFilter");
        new j("FB");
        new j("FDF");
        new j("Ff");
        new j("Fields");
        new j("Filespec");
        m0 = new j("Filter");
        f21237n0 = new j("First");
        new j("FirstChar");
        new j("FitWindow");
        new j("FL");
        new j("Flags");
        f21240o0 = new j("FlateDecode");
        f21243p0 = new j("Fl");
        new j("Folders");
        new j("Font");
        new j("FontBBox");
        new j("FontDescriptor");
        new j("FontFamily");
        new j("FontFile");
        new j("FontFile2");
        new j("FontFile3");
        new j("FontMatrix");
        new j("FontName");
        new j("FontStretch");
        new j("FontWeight");
        f21245q0 = new j(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16174W);
        new j("FormType");
        new j("FRM");
        new j("FT");
        new j("Function");
        new j("FunctionType");
        new j("Functions");
        new j(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        new j(ExifInterface.TAG_GAMMA);
        f21247r0 = new j("Group");
        f21249s0 = AbstractC2329d.i("GTS_PDFA1", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16182n);
        t0 = AbstractC2329d.i("HardLight", "Height");
        new j("Helv");
        new j("HideMenubar");
        new j("HideToolbar");
        new j("HideWindowUI");
        new j("Hue");
        new j("I");
        new j("IC");
        new j("ICCBased");
        u0 = new j("ID");
        f21256v0 = new j("IDTree");
        w0 = new j("Identity");
        new j("Identity-H");
        new j("Identity-V");
        new j("IF");
        new j("Illustrator");
        new j("IM");
        f21261x0 = new j("Image");
        y0 = AbstractC2329d.i("ImageMask", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.j);
        f21265z0 = AbstractC2329d.i("Indexed", "Info");
        new j("InkList");
        new j("Intent");
        new j("Interpolate");
        new j("IT");
        new j("ItalicAngle");
        new j("Issuer");
        new j("IX");
        new j("JavaScript");
        new j("JBIG2Decode");
        new j("JBIG2Globals");
        f21167A0 = new j("JPXDecode");
        f21170B0 = AbstractC2329d.i("JS", "K");
        f21172C0 = new j("Keywords");
        f21174D0 = AbstractC2329d.i("KeyUsage", "Kids");
        new j(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16189u);
        new j("Lab");
        f21175E0 = new j("Lang");
        new j("Last");
        new j("LastChar");
        new j("LastModified");
        new j("LC");
        new j("LE");
        new j("Leading");
        new j("LegalAttestation");
        f21177F0 = new j("Length");
        new j("Length1");
        new j("Length2");
        new j("Lighten");
        new j("Limits");
        new j("LJ");
        new j("LL");
        new j("LLE");
        new j("LLO");
        new j(RtspHeaders.LOCATION);
        new j("Luminosity");
        f21179G0 = AbstractC2329d.i("LW", "LZWDecode");
        f21180H0 = new j("LZW");
        new j("M");
        new j("Mac");
        new j("MacExpertEncoding");
        new j("MacRomanEncoding");
        new j("MarkInfo");
        new j("Mask");
        new j("Matrix");
        new j("Matte");
        new j("MaxLen");
        new j("MaxWidth");
        I0 = new j("MCID");
        new j("MDP");
        new j("MediaBox");
        new j("Measure");
        f21181J0 = new j("Metadata");
        new j("MissingWidth");
        new j("Mix");
        new j("MK");
        new j("ML");
        new j("MMType1");
        f21183K0 = new j("ModDate");
        f21184L0 = AbstractC2329d.i("Multiply", "N");
        f21185M0 = new j("Name");
        new j("Names");
        new j("Navigator");
        new j("NeedAppearances");
        new j("NewWindow");
        new j("Next");
        new j("NM");
        new j("NonEFontNoWarn");
        new j("NonFullScreenPageMode");
        new j("None");
        new j(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f16070D0);
        N0 = AbstractC2329d.i("Nums", "O");
        f21186O0 = new j("Obj");
        f21188P0 = new j("ObjStm");
        f21190Q0 = AbstractC2329d.i("OC", "OCG");
        R0 = AbstractC2329d.i("OCGs", "OCMD");
        f21193S0 = AbstractC2329d.i("OCProperties", "OE");
        new j("OID");
        new j("OFF");
        new j("Off");
        new j("ON");
        new j("OP");
        new j("op");
        new j("OpenAction");
        new j("OpenType");
        new j("OPM");
        new j("Opt");
        new j("Order");
        new j("Ordering");
        new j("OS");
        new j("Outlines");
        new j("OutputCondition");
        new j("OutputConditionIdentifier");
        new j("OutputIntent");
        new j("OutputIntents");
        new j("Overlay");
        f21195T0 = new j(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.m);
        f21197U0 = new j("Page");
        new j("PageLabels");
        new j("PageLayout");
        new j("PageMode");
        f21199V0 = new j("Pages");
        new j("PaintType");
        new j("Panose");
        new j("Params");
        f21201W0 = new j("Parent");
        f21203X0 = new j("ParentTree");
        f21205Y0 = new j("ParentTreeNextKey");
        new j(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16177b);
        new j("Path");
        new j("Pattern");
        new j("PatternType");
        new j("PDFDocEncoding");
        f21207Z0 = new j("Perms");
        new j("Perceptual");
        new j("PieceInfo");
        f21209a1 = new j("Pg");
        f21211b1 = AbstractC2329d.i("PreRelease", "Predictor");
        f21213c1 = new j("Prev");
        new j("PrintArea");
        new j("PrintClip");
        new j("PrintScaling");
        new j(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16181l);
        new j("ProcSet");
        f21216d1 = AbstractC2329d.i("Process", "Producer");
        new j("Prop_Build");
        new j("Properties");
        f21218e1 = new j("PS");
        new j("PubSec");
        new j("Q");
        new j("QuadPoints");
        f21220f1 = new j("R");
        new j(RtspHeaders.RANGE);
        new j("RC");
        new j("RD");
        new j("Reason");
        new j("Reasons");
        new j("RelativeColorimetric");
        new j("Repeat");
        g1 = new j("Recipients");
        new j("Rect");
        new j(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16161I);
        new j("Registry");
        new j("RegistryName");
        new j("Rename");
        new j("Resources");
        new j("RGB");
        new j("RI");
        f21224h1 = new j("RoleMap");
        f21226i1 = new j("Root");
        f21228j1 = AbstractC2329d.i("Rotate", "Rows");
        f21231k1 = new j("RunLengthDecode");
        f21234l1 = new j("RL");
        f21235m1 = AbstractC2329d.i("RV", "S");
        new j("SA");
        new j(ExifInterface.TAG_SATURATION);
        new j("Schema");
        new j("Screen");
        new j("SE");
        new j("Separation");
        new j("SetF");
        new j("SetFf");
        new j("Shading");
        new j("ShadingType");
        f21238n1 = new j("Sig");
        new j("SigFlags");
        new j("SigRef");
        f21241o1 = new j("Size");
        new j("SM");
        new j("SMask");
        new j("SoftLight");
        new j("Sort");
        new j("Sound");
        new j("Split");
        new j("SS");
        new j("St");
        new j("StandardEncoding");
        new j("State");
        new j("StateModel");
        new j("Status");
        p1 = new j("StdCF");
        new j("StemH");
        new j("StemV");
        q1 = new j("StmF");
        r1 = new j("StrF");
        new j(com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.g.f16050b);
        new j("StructParent");
        new j("StructParents");
        new j("StructTreeRoot");
        new j("Style");
        new j("SubFilter");
        new j("Subj");
        f21250s1 = new j("Subject");
        f21252t1 = AbstractC2329d.i("SubjectDN", "Subtype");
        new j("Supplement");
        new j("SV");
        new j("SVCert");
        new j("SW");
        new j("Sy");
        f21254u1 = AbstractC2329d.i("Synchronous", "T");
        new j("Target");
        new j("Templates");
        new j("Threads");
        new j("Thumb");
        new j("TI");
        new j("TilingType");
        new j("TimeStamp");
        f21257v1 = new j("Title");
        new j("TK");
        new j("TM");
        new j("ToUnicode");
        new j(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f16194z);
        new j("TR2");
        new j("Trapped");
        new j("Trans");
        new j("TransformMethod");
        new j("TransformParams");
        f21259w1 = new j("Transparency");
        new j("TRef");
        new j("TrimBox");
        new j("TrueType");
        new j("TrustedMode");
        new j("TU");
        f21262x1 = AbstractC2329d.i("Tx", "Type");
        new j("Type0");
        new j("Type1");
        new j("Type3");
        f21264y1 = new j("U");
        f21266z1 = new j("UE");
        new j("UF");
        new j("Unchanged");
        new j("Unix");
        new j("URI");
        new j("URL");
        new j("URLType");
        new j("UserUnit");
        f21168A1 = new j(ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        new j("VE");
        new j("VeriSign.PPKVS");
        new j("Version");
        new j("Vertices");
        new j("VerticesPerRow");
        new j("View");
        new j("ViewArea");
        new j("ViewClip");
        new j("ViewerPreferences");
        new j("Volume");
        f21171B1 = AbstractC2329d.i("VP", ExifInterface.LONGITUDE_WEST);
        new j("W2");
        new j(ExifInterface.TAG_WHITE_POINT);
        new j("Widget");
        f21173C1 = new j("Width");
        new j("Widths");
        new j("WinAnsiEncoding");
        new j("XFA");
        new j("XStep");
        new j("XHeight");
        D1 = new j("XObject");
        f21176E1 = new j("XRef");
        f21178F1 = new j("XRefStm");
        new j("YStep");
        new j("Yes");
        new j("ZaDb");
    }

    public j(String str, boolean z4) {
        this.f21267a = str;
        this.f21268b = str.hashCode();
        if (z4) {
            f21214d.put(str, this);
        } else {
            c.put(str, this);
        }
    }

    public static j f(String str) {
        if (str == null) {
            return null;
        }
        j jVar = (j) f21214d.get(str);
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = (j) c.get(str);
        return jVar2 == null ? new j(str, false) : jVar2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21267a.compareTo(((j) obj).f21267a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f21267a.equals(((j) obj).f21267a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21268b;
    }

    public final String toString() {
        return s.p(new StringBuilder("COSName{"), this.f21267a, "}");
    }

    public j(String str) {
        this(str, true);
    }
}
