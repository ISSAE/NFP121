#verbose=true

bean.id.1=context1
context1.class=question1.patron_strategie.Context
context1.property.1=strategy
context1.property.1.param.1=plus

bean.id.2=context2
context2.class=question1.patron_strategie.Context
context2.property.1=strategy
context2.property.1.param.1=moins

bean.id.3=context3
context3.class=question1.patron_strategie.Context
context3.property.1=strategy
context3.property.1.param.1=mul

bean.id.4=plus
plus.class=question1.patron_strategie.OperationAdd

bean.id.5=moins
moins.class=question1.patron_strategie.OperationSubstract

bean.id.6=mul
mul.class=question1.patron_strategie.OperationMultiply



