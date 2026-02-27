package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class Mp4WebvttParser implements SubtitleParser {
    private static final int BOX_HEADER_SIZE = 8;
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int TYPE_payl = 1885436268;
    private static final int TYPE_sttg = 1937011815;
    private static final int TYPE_vttc = 1987343459;
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    private static Cue parseVttCueBox(ParsableByteArray parsableByteArray, int i) {
        CharSequence cueText = null;
        Cue.Builder cueSettingsList = null;
        while (i > 0) {
            Assertions.checkArgument(i >= 8, "Incomplete vtt cue box header found.");
            int i4 = parsableByteArray.readInt();
            int i6 = parsableByteArray.readInt();
            int i10 = i4 - 8;
            String strFromUtf8Bytes = Util.fromUtf8Bytes(parsableByteArray.getData(), parsableByteArray.getPosition(), i10);
            parsableByteArray.skipBytes(i10);
            i = (i - 8) - i10;
            if (i6 == TYPE_sttg) {
                cueSettingsList = WebvttCueParser.parseCueSettingsList(strFromUtf8Bytes);
            } else if (i6 == TYPE_payl) {
                cueText = WebvttCueParser.parseCueText(null, strFromUtf8Bytes.trim(), Collections.EMPTY_LIST);
            }
        }
        if (cueText == null) {
            cueText = "";
        }
        return cueSettingsList != null ? cueSettingsList.setText(cueText).build() : WebvttCueParser.newCueForText(cueText);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        androidx.media3.extractor.text.a.a(this, bArr, outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i4) {
        return androidx.media3.extractor.text.a.b(this, bArr, i, i4);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ void reset() {
        androidx.media3.extractor.text.a.c(this);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i4, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        this.parsableByteArray.reset(bArr, i4 + i);
        this.parsableByteArray.setPosition(i);
        ArrayList arrayList = new ArrayList();
        while (this.parsableByteArray.bytesLeft() > 0) {
            Assertions.checkArgument(this.parsableByteArray.bytesLeft() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int i6 = this.parsableByteArray.readInt();
            if (this.parsableByteArray.readInt() == TYPE_vttc) {
                arrayList.add(parseVttCueBox(this.parsableByteArray, i6 - 8));
            } else {
                this.parsableByteArray.skipBytes(i6 - 8);
            }
        }
        consumer.accept(new CuesWithTiming(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
