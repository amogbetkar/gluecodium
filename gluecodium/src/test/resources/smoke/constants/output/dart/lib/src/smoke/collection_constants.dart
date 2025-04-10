

import 'dart:ffi';
import 'package:library/src/_library_context.dart' as __lib;
import 'package:library/src/_native_base.dart' as __lib;
import 'package:library/src/_token_cache.dart' as __lib;

abstract class CollectionConstants implements Finalizable {

  static final List<String> listConstant = ["foo", "bar"];

  static final Set<String> setConstant = {"foo", "bar"};

  static final Map<String, String> mapConstant = {"foo": "bar"};

  static final Map<List<String>, Set<String>> mixedConstant = {["foo"]: {"bar"}};

}


// CollectionConstants "private" section, not exported.

final _smokeCollectionconstantsRegisterFinalizer = __lib.catchArgumentError(() => __lib.nativeLibrary.lookupFunction<
    Void Function(Pointer<Void>, Int32, Handle),
    void Function(Pointer<Void>, int, Object)
  >('library_smoke_CollectionConstants_register_finalizer'));
final _smokeCollectionconstantsCopyHandle = __lib.catchArgumentError(() => __lib.nativeLibrary.lookupFunction<
    Pointer<Void> Function(Pointer<Void>),
    Pointer<Void> Function(Pointer<Void>)
  >('library_smoke_CollectionConstants_copy_handle'));
final _smokeCollectionconstantsReleaseHandle = __lib.catchArgumentError(() => __lib.nativeLibrary.lookupFunction<
    Void Function(Pointer<Void>),
    void Function(Pointer<Void>)
  >('library_smoke_CollectionConstants_release_handle'));


class CollectionConstants$Impl extends __lib.NativeBase implements CollectionConstants {

  CollectionConstants$Impl(Pointer<Void> handle) : super(handle);


}

Pointer<Void> smokeCollectionconstantsToFfi(CollectionConstants value) =>
  _smokeCollectionconstantsCopyHandle((value as __lib.NativeBase).handle);

CollectionConstants smokeCollectionconstantsFromFfi(Pointer<Void> handle) {
  if (handle.address == 0) throw StateError("Expected non-null value.");
  final instance = __lib.getCachedInstance(handle);
  if (instance != null && instance is CollectionConstants) return instance;

  final _copiedHandle = _smokeCollectionconstantsCopyHandle(handle);
  final result = CollectionConstants$Impl(_copiedHandle);
  __lib.cacheInstance(_copiedHandle, result);
  _smokeCollectionconstantsRegisterFinalizer(_copiedHandle, __lib.LibraryContext.isolateId, result);
  return result;
}

void smokeCollectionconstantsReleaseFfiHandle(Pointer<Void> handle) =>
  _smokeCollectionconstantsReleaseHandle(handle);

Pointer<Void> smokeCollectionconstantsToFfiNullable(CollectionConstants? value) =>
  value != null ? smokeCollectionconstantsToFfi(value) : Pointer<Void>.fromAddress(0);

CollectionConstants? smokeCollectionconstantsFromFfiNullable(Pointer<Void> handle) =>
  handle.address != 0 ? smokeCollectionconstantsFromFfi(handle) : null;

void smokeCollectionconstantsReleaseFfiHandleNullable(Pointer<Void> handle) =>
  _smokeCollectionconstantsReleaseHandle(handle);

// End of CollectionConstants "private" section.


