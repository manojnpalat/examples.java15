sealed interface IType permits X, Y, Z {}

final class X implements IType{}
final class Y implements IType{}
final class Z implements IType{}