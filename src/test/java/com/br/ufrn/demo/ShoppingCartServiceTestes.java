package com.br.ufrn.demo;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        ShoppingCartServiceTesteUmProdutoApplicationTests.class,
        ShoppingCartServiceTesteCincoProdutosApplicationTests.class,
        ShoppingCartServiceTesteCincoProdutosComRepeticaoApplicationTests.class
})
public class ShoppingCartServiceTestes {
}
