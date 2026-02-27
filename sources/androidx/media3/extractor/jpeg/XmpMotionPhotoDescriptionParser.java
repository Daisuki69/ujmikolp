package androidx.media3.extractor.jpeg;

import O1.O;
import O1.P;
import O1.S;
import O1.t0;
import We.s;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.extractor.jpeg.MotionPhotoDescription;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
final class XmpMotionPhotoDescriptionParser {
    private static final String TAG = "MotionPhotoXmpParser";
    private static final String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private XmpMotionPhotoDescriptionParser() {
    }

    @Nullable
    public static MotionPhotoDescription parse(String str) throws IOException {
        try {
            return parseInternal(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.w(TAG, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        return null;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.extractor.jpeg.MotionPhotoDescription parseInternal(java.lang.String r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r6)
            r0.setInput(r1)
            r0.next()
            java.lang.String r6 = "x:xmpmeta"
            boolean r1 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r6)
            r2 = 0
            if (r1 == 0) goto L75
            O1.P r1 = O1.S.f4555b
            O1.t0 r1 = O1.t0.e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L26:
            r0.next()
            java.lang.String r5 = "rdf:Description"
            boolean r5 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r5)
            if (r5 == 0) goto L41
            boolean r1 = parseMotionPhotoFlagFromDescription(r0)
            if (r1 != 0) goto L38
            goto L6e
        L38:
            long r3 = parseMotionPhotoPresentationTimestampUsFromDescription(r0)
            O1.S r1 = parseMicroVideoOffsetFromDescription(r0)
            goto L62
        L41:
            java.lang.String r5 = "Container:Directory"
            boolean r5 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r5)
            if (r5 == 0) goto L52
            java.lang.String r1 = "Container"
            java.lang.String r5 = "Item"
            O1.S r1 = parseMotionPhotoV1Directory(r0, r1, r5)
            goto L62
        L52:
            java.lang.String r5 = "GContainer:Directory"
            boolean r5 = androidx.media3.common.util.XmlPullParserUtil.isStartTag(r0, r5)
            if (r5 == 0) goto L62
            java.lang.String r1 = "GContainer"
            java.lang.String r5 = "GContainerItem"
            O1.S r1 = parseMotionPhotoV1Directory(r0, r1, r5)
        L62:
            boolean r5 = androidx.media3.common.util.XmlPullParserUtil.isEndTag(r0, r6)
            if (r5 == 0) goto L26
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L6f
        L6e:
            return r2
        L6f:
            androidx.media3.extractor.jpeg.MotionPhotoDescription r6 = new androidx.media3.extractor.jpeg.MotionPhotoDescription
            r6.<init>(r3, r1)
            return r6
        L75:
            java.lang.String r6 = "Couldn't find xmp metadata"
            androidx.media3.common.ParserException r6 = androidx.media3.common.ParserException.createForMalformedContainer(r6, r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.jpeg.XmpMotionPhotoDescriptionParser.parseInternal(java.lang.String):androidx.media3.extractor.jpeg.MotionPhotoDescription");
    }

    private static S parseMicroVideoOffsetFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return S.q(new MotionPhotoDescription.ContainerItem(MimeTypes.IMAGE_JPEG, "Primary", 0L, 0L), new MotionPhotoDescription.ContainerItem(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        P p10 = S.f4555b;
        return t0.e;
    }

    private static boolean parseMotionPhotoFlagFromDescription(XmlPullParser xmlPullParser) {
        for (String str : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long j = Long.parseLong(attributeValue);
                return j == -1 ? C.TIME_UNSET : j;
            }
        }
        return C.TIME_UNSET;
    }

    private static S parseMotionPhotoV1Directory(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        O oJ = S.j();
        String strI = s.i(str, ":Item");
        String strI2 = s.i(str, ":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, strI)) {
                String strI3 = s.i(str2, ":Mime");
                String strI4 = s.i(str2, ":Semantic");
                String strI5 = s.i(str2, ":Length");
                String strI6 = s.i(str2, ":Padding");
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, strI3);
                String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strI4);
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strI5);
                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strI6);
                if (attributeValue == null || attributeValue2 == null) {
                    return t0.e;
                }
                oJ.a(new MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, attributeValue3 != null ? Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0L));
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, strI2));
        return oJ.g();
    }
}
