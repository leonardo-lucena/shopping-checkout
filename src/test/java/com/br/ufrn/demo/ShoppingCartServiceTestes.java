package com.br.ufrn.demo;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

// Add the missing JUnit dependencies to your project's build configuration file

@Suite
@SelectClasses({
                ShoppingCartServiceTesteUmProdutoApplicationTests.class,
                ShoppingCartServiceTesteDoisProdutosApplicationTests.class,
                ShoppingCartServiceTesteCincoProdutosApplicationTests.class,
                ShoppingCartServiceTesteCincoProdutosComRepeticaoApplicationTests.class,
                ShoppingCartServiceTesteSeisProdutosApplicationTests.class,
                ShoppingCartServiceTesteSeisProdutosComRepeticaoApplicationTests.class,
                ShoppingCartServiceTesteQuinzeProdutosApplicationTests.class,
                ShoppingCartServiceTesteQuinzeProdutosComRepeticaoApplicationTests.class,
                ShoppingCartServiceOutrosTestes.class,
                CustomerServiceTest.class,
                ProductServiceTest.class,

})
public class ShoppingCartServiceTestes {
}
