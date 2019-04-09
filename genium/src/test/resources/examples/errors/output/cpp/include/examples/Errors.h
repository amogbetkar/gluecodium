// -------------------------------------------------------------------------------------------------
//
//
// -------------------------------------------------------------------------------------------------
//
// Automatically generated. Do not modify. Your changes will be lost.
//
// -------------------------------------------------------------------------------------------------

#pragma once

#include "genium/Export.h"
#include "genium/Return.h"
#include <string>
#include <system_error>

namespace examples {

class _GENIUM_CPP_EXPORT Errors {
public:
    virtual ~Errors() = 0;

public:
enum class InternalErrors {
    NONE,
    CRASHED,
    EXPLODED
};

public:
static ::std::error_code start_something_or_fail(  );
static ::genium::Return< ::std::string, ::std::error_code > get_something_or_fail(  );
};

_GENIUM_CPP_EXPORT ::std::error_code make_error_code( ::examples::Errors::InternalErrors value ) noexcept;
}

namespace std
{
template <>
struct is_error_code_enum <::examples::Errors::InternalErrors> : public std::true_type { };
}
