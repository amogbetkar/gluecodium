/*
 *
 * Automatically generated. Do not modify. Your changes will be lost.
 */
package com.example.smoke;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.example.NativeBase;
/**
 * <p>This is some very useful interface.</p>
 */
public class Comments extends NativeBase {
    /**
     * <p>This is some very useful constant.</p>
     */
    public static final boolean VERY_USEFUL = true;
    /**
     * <p>This is some very useful enum.</p>
     */
    public enum SomeEnum {
        /**
         * <p>Not quite useful</p>
         */
        USELESS(0),
        /**
         * <p>Somewhat useful</p>
         */
        USEFUL(1);
        public final int value;
        SomeEnum(final int value) {
            this.value = value;
        }
    }
    /**
     * <p>This is some very useful exception.</p>
     */
    public static class SomeEnumException extends Exception {
        public SomeEnumException(final Comments.SomeEnum error) {
            super(Integer.toString(error.value));
            this.error = error;
        }
        public final Comments.SomeEnum error;
    }
    /**
     * <p>This is some very useful struct.</p>
     */
    public static class SomeStruct {
        /**
         * <p>How useful this struct is</p>
         */
        public boolean someField;
        /**
         * <p>Can be <code>null</code></p>
         */
        @Nullable
        public String nullableField;
        /**
         * <p>This is how easy it is to construct.</p>
         * @param someField <p>How useful this struct is</p>
         * @param nullableField <p>Can be <code>null</code></p>
         */
        public SomeStruct(final boolean someField, @Nullable final String nullableField) {
            this.someField = someField;
            this.nullableField = nullableField;
        }
    }
    /**
     * For internal use only.
     * @exclude
     */
    protected Comments(final long nativeHandle) {
        super(nativeHandle, new Disposer() {
            @Override
            public void disposeNative(long handle) {
                disposeNativeHandle(handle);
            }
        });
    }
    private static native void disposeNativeHandle(long nativeHandle);
    /**
     * <p>This is some very useful method that measures the usefulness of its input.</p>
     * @param input <p>Very useful input parameter</p>
     * @return <p>Usefulness of the input</p>
     * @throws Comments.SomeEnumException <p>Sometimes it happens.</p>
     */
    public native boolean someMethodWithAllComments(@NonNull final String input) throws Comments.SomeEnumException;
    /**
     * <p>This is some very useful method that measures the usefulness of its input.</p>
     * @param input <p>Very useful input parameter</p>
     * @return
     */
    public native boolean someMethodWithInputComments(@NonNull final String input);
    /**
     * <p>This is some very useful method that measures the usefulness of its input.</p>
     * @param input
     * @return <p>Usefulness of the input</p>
     */
    public native boolean someMethodWithOutputComments(@NonNull final String input);
    /**
     * <p>This is some very useful method that measures the usefulness of its input.</p>
     * @param input
     * @return
     */
    public native boolean someMethodWithNoComments(@NonNull final String input);
    /**
     * <p>This is some very useful method that does not measure the usefulness of its input.</p>
     * @param input <p>Very useful input parameter</p>
     */
    public native void someMethodWithoutReturnTypeWithAllComments(@NonNull final String input);
    /**
     * <p>This is some very useful method that does not measure the usefulness of its input.</p>
     * @param input
     */
    public native void someMethodWithoutReturnTypeWithNoComments(@NonNull final String input);
    /**
     * <p>This is some very useful method that measures the usefulness of something.</p>
     * @return <p>Usefulness of the input</p>
     */
    public native boolean someMethodWithoutInputParametersWithAllComments();
    /**
     * <p>This is some very useful method that measures the usefulness of something.</p>
     * @return
     */
    public native boolean someMethodWithoutInputParametersWithNoComments();
    public native void someMethodWithNothing();
    /**
     * <p>This is some very useful method that does nothing.</p>
     */
    public native void someMethodWithoutReturnTypeOrInputParameters();
    /**
     * <p>This is some very useful instance method.</p>
     * @param input <p>This is some very useful instance method parameter.</p>
     * @return <p>This is some very useful instance method result.</p>
     */
    @NonNull
    public native CommentsInstantiable instanceMethod(@NonNull final CommentsInstantiable input);
    /**
     *
     * @param undocumented
     * @param documented <p>nicely documented</p>
     * @return
     */
    @NonNull
    public native String oneParameterCommentOnly(@NonNull final String undocumented, @NonNull final String documented);
    /**
     *
     * @param undocumented
     * @return <p>nicely documented</p>
     */
    @NonNull
    public native String returnCommentOnly(@NonNull final String undocumented);
    /**
     * <p>Gets some very useful attribute.</p>
     */
    public native boolean isSomeAttribute();
    /**
     * <p>Sets some very useful attribute.</p>
     * @param value
     */
    public native void setSomeAttribute(final boolean value);
    /**
     * <p>Gets some very useful attribute.</p>
     */
    @NonNull
    public native CommentsInstantiable getInstanceAttribute();
    /**
     * <p>Sets some very useful attribute.</p>
     * @param value
     */
    public native void setInstanceAttribute(@NonNull final CommentsInstantiable value);
}
