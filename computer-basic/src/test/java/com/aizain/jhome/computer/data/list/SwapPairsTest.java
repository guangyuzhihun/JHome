package com.aizain.jhome.computer.data.list;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
class SwapPairsTest {

    SwapPairs swapPairs = new SwapPairs();
    SwapPairs.ListNode inputNode = new SwapPairs.ListNode(1);

    @BeforeEach
    void setUp() {
        inputNode.next = new SwapPairs.ListNode(2);
        inputNode.next.next = new SwapPairs.ListNode(3);
        inputNode.next.next.next = new SwapPairs.ListNode(4);
        inputNode.next.next.next.next = new SwapPairs.ListNode(5);
        inputNode.next.next.next.next.next = null;
    }

    @Test
    void swapPairs() {
        log.debug("swapPairs begin: {}", getPrint(inputNode));
        SwapPairs.ListNode endNode = swapPairs.swapPairs(inputNode);
        log.debug("swapPairs end: {}", getPrint(endNode));
    }

    @Test
    void swapPairsRecursive() {
        log.debug("swapPairsRecursive begin: {}", getPrint(inputNode));
        SwapPairs.ListNode endNode = swapPairs.swapPairsRecursive(inputNode);
        log.debug("swapPairsRecursive end: {}", getPrint(endNode));
    }

    private String getPrint(SwapPairs.ListNode nodeList) {
        StringBuilder stringBuilder = new StringBuilder("[");
        SwapPairs.ListNode tmp = nodeList;
        while (tmp.next != null) {
            stringBuilder
                    .append(tmp.val)
                    .append(", ")
            ;
            tmp = tmp.next;
        }
        stringBuilder.append(tmp.val).append("]");
        return stringBuilder.toString();
    }
}