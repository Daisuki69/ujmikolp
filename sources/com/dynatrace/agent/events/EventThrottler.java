package com.dynatrace.agent.events;

import Bj.E;
import Bj.H;
import Bj.O;
import Bj.U;
import Ij.d;
import Ij.e;
import bj.AbstractC1039j;
import cj.C1110A;
import cj.C1132s;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.agent.events.EventThrottler;
import com.dynatrace.agent.events.enrichment.EventKeys;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import ij.InterfaceC1611e;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.time.a;
import kotlin.time.b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class EventThrottler {
    private final E coroutineScope;
    private volatile int dropCounter;
    private final List<EventThrottlerType> eventBuckets;
    private final LinkedList<Long> eventWindow;
    private final ReentrantLock lock;
    private final int maxEventsPerWindow;
    private final int summaryInterval;
    private final Function1<String, Unit> summaryReceiver;
    private final TimeProvider timeProvider;
    private final int windowSizeSeconds;

    public static abstract class EventThrottlerType {
        private int droppedEvent;
        private int sendEvent;
        private final String type;

        public static final class EventApi extends EventThrottlerType {
            public EventApi() {
                super(0, 0, "API", 3, null);
            }
        }

        public static final class EventBiz extends EventThrottlerType {
            public EventBiz() {
                super(0, 0, "BIZ", 3, null);
            }
        }

        public static final class EventErr extends EventThrottlerType {
            public EventErr() {
                super(0, 0, "ERR", 3, null);
            }
        }

        public static final class EventOth extends EventThrottlerType {
            public EventOth() {
                super(0, 0, "OTH", 3, null);
            }
        }

        public static final class EventSfm extends EventThrottlerType {
            public EventSfm() {
                super(0, 0, "SFM", 3, null);
            }
        }

        public static final class EventWrq extends EventThrottlerType {
            public EventWrq() {
                super(0, 0, "WRQ", 3, null);
            }
        }

        public /* synthetic */ EventThrottlerType(int i, int i4, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i4, str);
        }

        public final int getDroppedEvent() {
            return this.droppedEvent;
        }

        public final int getSendEvent() {
            return this.sendEvent;
        }

        public final String getType() {
            return this.type;
        }

        public final void setDroppedEvent(int i) {
            this.droppedEvent = i;
        }

        public final void setSendEvent(int i) {
            this.sendEvent = i;
        }

        private EventThrottlerType(int i, int i4, String str) {
            this.sendEvent = i;
            this.droppedEvent = i4;
            this.type = str;
        }

        public /* synthetic */ EventThrottlerType(int i, int i4, String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i4, str, null);
        }
    }

    /* JADX INFO: renamed from: com.dynatrace.agent.events.EventThrottler$processEventIfPossible$1, reason: invalid class name */
    @InterfaceC1611e(c = "com.dynatrace.agent.events.EventThrottler$processEventIfPossible$1", f = "EventThrottler.kt", l = {120}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super Unit>, Object> {
        int label;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(2, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return EventThrottler.this.new AnonymousClass1(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(E e, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((AnonymousClass1) create(e, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                a.C0097a c0097a = kotlin.time.a.f18208b;
                long jE = b.e(EventThrottler.this.summaryInterval, Aj.b.f331d);
                this.label = 1;
                if (O.c(jE, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            ReentrantLock reentrantLock = EventThrottler.this.lock;
            EventThrottler eventThrottler = EventThrottler.this;
            reentrantLock.lock();
            try {
                String strGenerateMessage = eventThrottler.generateMessage(eventThrottler.eventBuckets);
                eventThrottler.dropCounter = 0;
                for (EventThrottlerType eventThrottlerType : eventThrottler.eventBuckets) {
                    eventThrottlerType.setDroppedEvent(0);
                    eventThrottlerType.setSendEvent(0);
                }
                eventThrottler.summaryReceiver.invoke(strGenerateMessage);
                Unit unit = Unit.f18162a;
                reentrantLock.unlock();
                return Unit.f18162a;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventThrottler(TimeProvider timeProvider, int i, int i4, int i6, Function1<? super String, Unit> summaryReceiver) {
        this(timeProvider, i, i4, i6, null, summaryReceiver, 16, null);
        j.g(timeProvider, "timeProvider");
        j.g(summaryReceiver, "summaryReceiver");
    }

    private final EventThrottlerType findByCharacteristics(List<? extends EventThrottlerType> list, JSONObject jSONObject) {
        if (jSONObject.optBoolean(EventKeys.Characteristics.IS_SELF_MONITORING)) {
            for (EventThrottlerType eventThrottlerType : list) {
                if (eventThrottlerType instanceof EventThrottlerType.EventSfm) {
                    return eventThrottlerType;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (jSONObject.optBoolean(EventKeys.Characteristics.HAS_REQUEST)) {
            for (EventThrottlerType eventThrottlerType2 : list) {
                if (eventThrottlerType2 instanceof EventThrottlerType.EventWrq) {
                    return eventThrottlerType2;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (jSONObject.optBoolean(EventKeys.Characteristics.HAS_ERROR)) {
            for (EventThrottlerType eventThrottlerType3 : list) {
                if (eventThrottlerType3 instanceof EventThrottlerType.EventErr) {
                    return eventThrottlerType3;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (jSONObject.optBoolean(EventKeys.Characteristics.IS_API_REPORTED)) {
            for (EventThrottlerType eventThrottlerType4 : list) {
                if (eventThrottlerType4 instanceof EventThrottlerType.EventApi) {
                    return eventThrottlerType4;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        for (EventThrottlerType eventThrottlerType5 : list) {
            if (eventThrottlerType5 instanceof EventThrottlerType.EventOth) {
                return eventThrottlerType5;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.dynatrace.agent.events.EventThrottler.EventThrottlerType findByProtocolId(java.util.List<? extends com.dynatrace.agent.events.EventThrottler.EventThrottlerType> r3, int r4) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.agent.events.EventThrottler.findByProtocolId(java.util.List, int):com.dynatrace.agent.events.EventThrottler$EventThrottlerType");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateMessage(List<? extends EventThrottlerType> list) {
        List<? extends EventThrottlerType> list2 = list;
        final int i = 0;
        String strF = C1110A.F(list2, ",", null, null, new Function1() { // from class: com.dynatrace.agent.events.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EventThrottler.EventThrottlerType eventThrottlerType = (EventThrottler.EventThrottlerType) obj;
                switch (i) {
                    case 0:
                        return EventThrottler.generateMessage$lambda$14(eventThrottlerType);
                    default:
                        return EventThrottler.generateMessage$lambda$15(eventThrottlerType);
                }
            }
        }, 30);
        final int i4 = 1;
        String strF2 = C1110A.F(list2, ",", null, null, new Function1() { // from class: com.dynatrace.agent.events.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EventThrottler.EventThrottlerType eventThrottlerType = (EventThrottler.EventThrottlerType) obj;
                switch (i4) {
                    case 0:
                        return EventThrottler.generateMessage$lambda$14(eventThrottlerType);
                    default:
                        return EventThrottler.generateMessage$lambda$15(eventThrottlerType);
                }
            }
        }, 30);
        StringBuilder sb2 = new StringBuilder("Dropped ");
        sb2.append(this.dropCounter);
        sb2.append(" events, current limit: ");
        sb2.append(this.maxEventsPerWindow);
        sb2.append(" - type sent: [");
        sb2.append(strF);
        sb2.append("], dropped: [");
        return androidx.camera.core.impl.a.n(sb2, strF2, ']');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence generateMessage$lambda$14(EventThrottlerType it) {
        j.g(it, "it");
        return it.getType() + ':' + it.getSendEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence generateMessage$lambda$15(EventThrottlerType it) {
        j.g(it, "it");
        return it.getType() + ':' + it.getDroppedEvent();
    }

    /* JADX INFO: renamed from: moveWindow-SxA4cEA, reason: not valid java name */
    private final void m164moveWindowSxA4cEA(LinkedList<Long> linkedList, long j, long j6) {
        long jD = j - kotlin.time.a.d(j6);
        while (!linkedList.isEmpty()) {
            Long lPeek = linkedList.peek();
            j.d(lPeek);
            if (lPeek.longValue() > jD) {
                return;
            } else {
                linkedList.poll();
            }
        }
    }

    private final boolean processEventIfPossible(EventThrottlerType eventThrottlerType) {
        long jMillisSinceEpoch = this.timeProvider.millisSinceEpoch();
        LinkedList<Long> linkedList = this.eventWindow;
        a.C0097a c0097a = kotlin.time.a.f18208b;
        m164moveWindowSxA4cEA(linkedList, jMillisSinceEpoch, b.e(this.windowSizeSeconds, Aj.b.f331d));
        if (this.eventWindow.size() < this.maxEventsPerWindow) {
            this.eventWindow.add(Long.valueOf(jMillisSinceEpoch));
            eventThrottlerType.setSendEvent(eventThrottlerType.getSendEvent() + 1);
            return true;
        }
        this.dropCounter++;
        eventThrottlerType.setDroppedEvent(eventThrottlerType.getDroppedEvent() + 1);
        if (this.dropCounter != 1) {
            return false;
        }
        H.w(this.coroutineScope, null, null, new AnonymousClass1(null), 3);
        return false;
    }

    public final boolean acceptEvent(int i) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return processEventIfPossible(findByProtocolId(this.eventBuckets, i));
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventThrottler(TimeProvider timeProvider, int i, int i4, Function1<? super String, Unit> summaryReceiver) {
        this(timeProvider, i, i4, 0, null, summaryReceiver, 24, null);
        j.g(timeProvider, "timeProvider");
        j.g(summaryReceiver, "summaryReceiver");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventThrottler(TimeProvider timeProvider, int i, Function1<? super String, Unit> summaryReceiver) {
        this(timeProvider, i, 0, 0, null, summaryReceiver, 28, null);
        j.g(timeProvider, "timeProvider");
        j.g(summaryReceiver, "summaryReceiver");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventThrottler(TimeProvider timeProvider, int i, int i4, int i6, E coroutineScope, Function1<? super String, Unit> summaryReceiver) {
        j.g(timeProvider, "timeProvider");
        j.g(coroutineScope, "coroutineScope");
        j.g(summaryReceiver, "summaryReceiver");
        this.timeProvider = timeProvider;
        this.maxEventsPerWindow = i;
        this.windowSizeSeconds = i4;
        this.summaryInterval = i6;
        this.coroutineScope = coroutineScope;
        this.summaryReceiver = summaryReceiver;
        this.eventWindow = new LinkedList<>();
        this.lock = new ReentrantLock();
        this.eventBuckets = C1132s.g(new EventThrottlerType.EventApi(), new EventThrottlerType.EventWrq(), new EventThrottlerType.EventErr(), new EventThrottlerType.EventOth(), new EventThrottlerType.EventBiz(), new EventThrottlerType.EventSfm());
    }

    public final boolean acceptEvent(JSONObject jsonEvent) {
        j.g(jsonEvent, "jsonEvent");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return processEventIfPossible(findByCharacteristics(this.eventBuckets, jsonEvent));
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EventThrottler(TimeProvider timeProvider, int i, int i4, int i6, E e, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        i4 = (i10 & 4) != 0 ? 60 : i4;
        i6 = (i10 & 8) != 0 ? 60 : i6;
        if ((i10 & 16) != 0) {
            e eVar = U.f603a;
            e = H.c(d.f2362a);
        }
        this(timeProvider, i, i4, i6, e, function1);
    }
}
