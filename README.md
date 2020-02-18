# Stock-Exchange-Platform-Java
The implementation of exchange data structures for the stock order book

-We want to quickly find the bid and offer books for a specific market id
For a given book - bid or offer - we want something that allows us to
quickly add new price levels.

-We want to be able to quickly traverse from any price level to higher or
lower price levels if necessary
Within a price level, we want to be able to quickly traverse all resting
orders.

-In the real world, the cancel message is often urgent, so we want to be
able to cancel orders quickly
