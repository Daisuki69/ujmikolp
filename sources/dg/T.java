package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Resolution;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class T extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5I"));
        long jBeginMessage = protoReader.beginMessage();
        Integer numDecode = null;
        Integer numDecode2 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Resolution(numDecode, numDecode2, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                numDecode = ProtoAdapter.INT32.decode(protoReader);
            } else if (iNextTag != 2) {
                protoReader.readUnknownField(iNextTag);
            } else {
                numDecode2 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        Resolution resolution = (Resolution) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5q"));
        kotlin.jvm.internal.j.g(resolution, numX49.tnTj78("bd5z"));
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, resolution.getWidth());
        protoAdapter.encodeWithTag(protoWriter, 2, resolution.getHeight());
        protoWriter.writeBytes(resolution.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Resolution resolution = (Resolution) obj;
        kotlin.jvm.internal.j.g(resolution, numX49.tnTj78("bd5P9"));
        int size = resolution.unknownFields().size();
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(2, resolution.getHeight()) + protoAdapter.encodedSizeWithTag(1, resolution.getWidth()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Resolution resolution = (Resolution) obj;
        kotlin.jvm.internal.j.g(resolution, numX49.tnTj78("bd5PP"));
        return Resolution.copy$default(resolution, null, null, ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        Resolution resolution = (Resolution) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5l"));
        kotlin.jvm.internal.j.g(resolution, numX49.tnTj78("bd5W"));
        reverseProtoWriter.writeBytes(resolution.unknownFields());
        ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, resolution.getHeight());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, resolution.getWidth());
    }
}
