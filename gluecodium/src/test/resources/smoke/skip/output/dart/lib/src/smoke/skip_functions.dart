

import 'dart:ffi';
import 'package:library/src/_library_context.dart' as __lib;
import 'package:library/src/_native_base.dart' as __lib;
import 'package:library/src/_token_cache.dart' as __lib;
import 'package:library/src/builtin_types__conversion.dart';
import 'package:meta/meta.dart';

abstract class SkipFunctions implements Finalizable {


  static String notInJava(String input) => $prototype.notInJava(input);

  static bool notInSwift(bool input) => $prototype.notInSwift(input);

  static String notInKotlin(String input) => $prototype.notInKotlin(input);

  /// @nodoc
  @visibleForTesting
  static dynamic $prototype = SkipFunctions$Impl(Pointer<Void>.fromAddress(0));
}


// SkipFunctions "private" section, not exported.

final _smokeSkipfunctionsRegisterFinalizer = __lib.catchArgumentError(() => __lib.nativeLibrary.lookupFunction<
    Void Function(Pointer<Void>, Int32, Handle),
    void Function(Pointer<Void>, int, Object)
  >('library_smoke_SkipFunctions_register_finalizer'));
final _smokeSkipfunctionsCopyHandle = __lib.catchArgumentError(() => __lib.nativeLibrary.lookupFunction<
    Pointer<Void> Function(Pointer<Void>),
    Pointer<Void> Function(Pointer<Void>)
  >('library_smoke_SkipFunctions_copy_handle'));
final _smokeSkipfunctionsReleaseHandle = __lib.catchArgumentError(() => __lib.nativeLibrary.lookupFunction<
    Void Function(Pointer<Void>),
    void Function(Pointer<Void>)
  >('library_smoke_SkipFunctions_release_handle'));





/// @nodoc
@visibleForTesting

class SkipFunctions$Impl extends __lib.NativeBase implements SkipFunctions {

  SkipFunctions$Impl(Pointer<Void> handle) : super(handle);

  String notInJava(String input) {
    final _notInJavaFfi = __lib.catchArgumentError(() => __lib.nativeLibrary.lookupFunction<Pointer<Void> Function(Int32, Pointer<Void>), Pointer<Void> Function(int, Pointer<Void>)>('library_smoke_SkipFunctions_notInJava__String'));
    final _inputHandle = stringToFfi(input);
    final __resultHandle = _notInJavaFfi(__lib.LibraryContext.isolateId, _inputHandle);
    stringReleaseFfiHandle(_inputHandle);
    try {
      return stringFromFfi(__resultHandle);
    } finally {
      stringReleaseFfiHandle(__resultHandle);

    }

  }

  bool notInSwift(bool input) {
    final _notInSwiftFfi = __lib.catchArgumentError(() => __lib.nativeLibrary.lookupFunction<Uint8 Function(Int32, Uint8), int Function(int, int)>('library_smoke_SkipFunctions_notInSwift__Boolean'));
    final _inputHandle = booleanToFfi(input);
    final __resultHandle = _notInSwiftFfi(__lib.LibraryContext.isolateId, _inputHandle);
    booleanReleaseFfiHandle(_inputHandle);
    try {
      return booleanFromFfi(__resultHandle);
    } finally {
      booleanReleaseFfiHandle(__resultHandle);

    }

  }

  String notInKotlin(String input) {
    final _notInKotlinFfi = __lib.catchArgumentError(() => __lib.nativeLibrary.lookupFunction<Pointer<Void> Function(Int32, Pointer<Void>), Pointer<Void> Function(int, Pointer<Void>)>('library_smoke_SkipFunctions_notInKotlin__String'));
    final _inputHandle = stringToFfi(input);
    final __resultHandle = _notInKotlinFfi(__lib.LibraryContext.isolateId, _inputHandle);
    stringReleaseFfiHandle(_inputHandle);
    try {
      return stringFromFfi(__resultHandle);
    } finally {
      stringReleaseFfiHandle(__resultHandle);

    }

  }


}

Pointer<Void> smokeSkipfunctionsToFfi(SkipFunctions value) =>
  _smokeSkipfunctionsCopyHandle((value as __lib.NativeBase).handle);

SkipFunctions smokeSkipfunctionsFromFfi(Pointer<Void> handle) {
  if (handle.address == 0) throw StateError("Expected non-null value.");
  final instance = __lib.getCachedInstance(handle);
  if (instance != null && instance is SkipFunctions) return instance;

  final _copiedHandle = _smokeSkipfunctionsCopyHandle(handle);
  final result = SkipFunctions$Impl(_copiedHandle);
  __lib.cacheInstance(_copiedHandle, result);
  _smokeSkipfunctionsRegisterFinalizer(_copiedHandle, __lib.LibraryContext.isolateId, result);
  return result;
}

void smokeSkipfunctionsReleaseFfiHandle(Pointer<Void> handle) =>
  _smokeSkipfunctionsReleaseHandle(handle);

Pointer<Void> smokeSkipfunctionsToFfiNullable(SkipFunctions? value) =>
  value != null ? smokeSkipfunctionsToFfi(value) : Pointer<Void>.fromAddress(0);

SkipFunctions? smokeSkipfunctionsFromFfiNullable(Pointer<Void> handle) =>
  handle.address != 0 ? smokeSkipfunctionsFromFfi(handle) : null;

void smokeSkipfunctionsReleaseFfiHandleNullable(Pointer<Void> handle) =>
  _smokeSkipfunctionsReleaseHandle(handle);

// End of SkipFunctions "private" section.


