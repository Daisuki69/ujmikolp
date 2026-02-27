package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.MediaCount;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: renamed from: dg.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1375I extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5P1"));
        long jBeginMessage = protoReader.beginMessage();
        Integer numDecode = null;
        Integer numDecode2 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new MediaCount(numDecode, numDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                numDecode = ProtoAdapter.UINT32.decode(protoReader);
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                numDecode2 = ProtoAdapter.UINT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        MediaCount mediaCount = (MediaCount) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5Pn"));
        kotlin.jvm.internal.j.g(mediaCount, numX49.tnTj78("bd5Px"));
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(protoWriter, 1, mediaCount.getImage());
        protoAdapter.encodeWithTag(protoWriter, 2, mediaCount.getVideo());
        protoWriter.writeBytes(mediaCount.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MediaCount mediaCount = (MediaCount) obj;
        kotlin.jvm.internal.j.g(mediaCount, numX49.tnTj78("bd5PJ"));
        int size = mediaCount.unknownFields().size();
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
        return protoAdapter.encodedSizeWithTag(2, mediaCount.getVideo()) + protoAdapter.encodedSizeWithTag(1, mediaCount.getImage()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MediaCount mediaCount = (MediaCount) obj;
        kotlin.jvm.internal.j.g(mediaCount, numX49.tnTj78("bd5PI"));
        return MediaCount.copy$default(mediaCount, null, null, ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        MediaCount mediaCount = (MediaCount) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5Ps"));
        kotlin.jvm.internal.j.g(mediaCount, numX49.tnTj78("bd5P5"));
        reverseProtoWriter.writeBytes(mediaCount.unknownFields());
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, mediaCount.getVideo());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, mediaCount.getImage());
    }
}
