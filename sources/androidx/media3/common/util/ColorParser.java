package androidx.media3.common.util;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import com.dynatrace.android.agent.Global;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.v0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ColorParser {
    private static final Map<String, Integer> COLOR_MAP;
    private static final String RGB = "rgb";
    private static final String RGBA = "rgba";
    private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap map = new HashMap();
        COLOR_MAP = map;
        androidx.camera.core.impl.a.z(-984833, map, "aliceblue", -332841, "antiquewhite");
        androidx.camera.core.impl.a.D(map, "aqua", -16711681, -8388652, "aquamarine");
        androidx.camera.core.impl.a.z(-983041, map, "azure", -657956, "beige");
        androidx.camera.core.impl.a.z(-6972, map, "bisque", -16777216, "black");
        androidx.camera.core.impl.a.z(-5171, map, "blanchedalmond", -16776961, "blue");
        androidx.camera.core.impl.a.z(-7722014, map, "blueviolet", -5952982, "brown");
        androidx.camera.core.impl.a.z(-2180985, map, "burlywood", -10510688, "cadetblue");
        androidx.camera.core.impl.a.z(-8388864, map, "chartreuse", -2987746, "chocolate");
        androidx.camera.core.impl.a.z(-32944, map, "coral", -10185235, "cornflowerblue");
        androidx.camera.core.impl.a.z(-1828, map, "cornsilk", -2354116, "crimson");
        androidx.camera.core.impl.a.D(map, "cyan", -16711681, -16777077, "darkblue");
        androidx.camera.core.impl.a.z(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        androidx.camera.core.impl.a.D(map, "darkgray", -5658199, -16751616, "darkgreen");
        androidx.camera.core.impl.a.D(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        androidx.camera.core.impl.a.z(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        androidx.camera.core.impl.a.z(-29696, map, "darkorange", -6737204, "darkorchid");
        androidx.camera.core.impl.a.z(-7667712, map, "darkred", -1468806, "darksalmon");
        androidx.camera.core.impl.a.z(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        androidx.camera.core.impl.a.D(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        androidx.camera.core.impl.a.z(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        androidx.camera.core.impl.a.D(map, "dodgerblue", -14774017, -5103070, "firebrick");
        androidx.camera.core.impl.a.z(-1296, map, "floralwhite", -14513374, "forestgreen");
        androidx.camera.core.impl.a.D(map, "fuchsia", -65281, -2302756, "gainsboro");
        androidx.camera.core.impl.a.z(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        androidx.camera.core.impl.a.z(-16744448, map, "green", -5374161, "greenyellow");
        androidx.camera.core.impl.a.D(map, "grey", -8355712, -983056, "honeydew");
        androidx.camera.core.impl.a.z(-38476, map, "hotpink", -3318692, "indianred");
        androidx.camera.core.impl.a.z(-11861886, map, "indigo", -16, "ivory");
        androidx.camera.core.impl.a.z(-989556, map, "khaki", -1644806, "lavender");
        androidx.camera.core.impl.a.z(-3851, map, "lavenderblush", -8586240, "lawngreen");
        androidx.camera.core.impl.a.z(-1331, map, "lemonchiffon", -5383962, "lightblue");
        androidx.camera.core.impl.a.z(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        androidx.camera.core.impl.a.z(-18751, map, "lightpink", -24454, "lightsalmon");
        androidx.camera.core.impl.a.z(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        androidx.camera.core.impl.a.D(map, "lightsteelblue", -5192482, -32, "lightyellow");
        androidx.camera.core.impl.a.z(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        androidx.camera.core.impl.a.z(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        androidx.camera.core.impl.a.z(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        androidx.camera.core.impl.a.z(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        androidx.camera.core.impl.a.z(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        androidx.camera.core.impl.a.z(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        androidx.camera.core.impl.a.z(-15132304, map, "midnightblue", -655366, "mintcream");
        androidx.camera.core.impl.a.z(-6943, map, "mistyrose", -6987, "moccasin");
        androidx.camera.core.impl.a.z(-8531, map, "navajowhite", -16777088, "navy");
        androidx.camera.core.impl.a.z(-133658, map, "oldlace", -8355840, "olive");
        androidx.camera.core.impl.a.z(-9728477, map, "olivedrab", -23296, "orange");
        androidx.camera.core.impl.a.z(-47872, map, "orangered", -2461482, "orchid");
        androidx.camera.core.impl.a.z(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        androidx.camera.core.impl.a.z(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        androidx.camera.core.impl.a.z(-4139, map, "papayawhip", -9543, "peachpuff");
        androidx.camera.core.impl.a.z(-3308225, map, "peru", -16181, "pink");
        androidx.camera.core.impl.a.z(-2252579, map, "plum", -5185306, "powderblue");
        androidx.camera.core.impl.a.z(-8388480, map, "purple", -10079335, "rebeccapurple");
        androidx.camera.core.impl.a.z(-65536, map, "red", -4419697, "rosybrown");
        androidx.camera.core.impl.a.z(-12490271, map, "royalblue", -7650029, "saddlebrown");
        androidx.camera.core.impl.a.z(-360334, map, "salmon", -744352, "sandybrown");
        androidx.camera.core.impl.a.z(-13726889, map, "seagreen", -2578, "seashell");
        androidx.camera.core.impl.a.z(-6270419, map, "sienna", -4144960, "silver");
        androidx.camera.core.impl.a.z(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        androidx.camera.core.impl.a.D(map, "snow", -1286, -16711809, "springgreen");
        androidx.camera.core.impl.a.z(-12156236, map, "steelblue", -2968436, "tan");
        androidx.camera.core.impl.a.z(-16744320, map, "teal", -2572328, "thistle");
        androidx.camera.core.impl.a.z(-40121, map, "tomato", 0, "transparent");
        androidx.camera.core.impl.a.z(-12525360, map, "turquoise", -1146130, "violet");
        androidx.camera.core.impl.a.z(-663885, map, "wheat", -1, "white");
        androidx.camera.core.impl.a.z(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    private ColorParser() {
    }

    @ColorInt
    private static int parseColorInternal(String str, boolean z4) {
        Assertions.checkArgument(!TextUtils.isEmpty(str));
        String strReplace = str.replace(Global.BLANK, "");
        if (strReplace.charAt(0) == '#') {
            int i = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i;
            }
            if (strReplace.length() == 9) {
                return ((i & 255) << 24) | (i >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith(RGBA)) {
            Matcher matcher = (z4 ? RGBA_PATTERN_FLOAT_ALPHA : RGBA_PATTERN_INT_ALPHA).matcher(strReplace);
            if (matcher.matches()) {
                return Color.argb(z4 ? (int) (Float.parseFloat((String) Assertions.checkNotNull(matcher.group(4))) * 255.0f) : Integer.parseInt((String) Assertions.checkNotNull(matcher.group(4)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(3)), 10));
            }
        } else if (strReplace.startsWith(RGB)) {
            Matcher matcher2 = RGB_PATTERN.matcher(strReplace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(1)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(2)), 10), Integer.parseInt((String) Assertions.checkNotNull(matcher2.group(3)), 10));
            }
        } else {
            Integer num = COLOR_MAP.get(v0.H(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    @ColorInt
    public static int parseCssColor(String str) {
        return parseColorInternal(str, true);
    }

    @ColorInt
    public static int parseTtmlColor(String str) {
        return parseColorInternal(str, false);
    }
}
